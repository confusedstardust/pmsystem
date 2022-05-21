package com.hj.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class uploadTools {

    public String upload(MultipartFile file,String num,String path) throws IOException {
        File filepath=new File(path);
        if(!filepath.exists()) {
            filepath.mkdirs();
        }
        String fileName=num+"_"+file.getOriginalFilename();
        file.transferTo(new File(filepath+"\\"+fileName));
        String finalpath=filepath+"\\"+fileName;
        finalpath=finalpath.substring(37);
//        E:\\桌面x\\原D盘\\11111\\pmsystem\\WebContent\\plsimage";
        finalpath=finalpath.replace("\\","/");

        return finalpath;
    }
}
