import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ultimate {
    public static int nl = 0;
    public static int xw = 0;
    public static int bl = 0;
    public static int jl = 0;
    public static int jr = 0;
    public static int gf = 0;
    public static int flag = 1;
    public static int tgf=0,tjl=0,tnl=0,txw=0,tbl=0,tjr=0;
    public static void main(String[] args) throws Exception {

//        System.out.println(tenToUltimate(48));
        Map<String,String> map=new HashMap<>();
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        map.put("官方","703007996");
        map.put("大哥","351609538");
        map.put("乃琳","672342685");
        map.put("向晚","672346917");
        map.put("贝拉","672353429");
        map.put("然然","672328094");

        while (true){
            //        每隔5秒执行一次
            Thread.sleep(5000);
            for (Map.Entry<String,String> entry:map.entrySet()){
               getHtml(entry.getValue(),entry.getKey());
            }
            System.out.println("累计取关人数---官方:"+tgf+"\t大哥:"+tjl+"\t乃琳:"+tnl+"\t向晚:"+txw+"\t贝拉:"+tbl+"\t然然:"+tjr);
            System.out.println("===============================================================");
        }

    }
    public static String tenToUltimate(int num) {
        StringBuffer result = new StringBuffer();
        int temp ;
        while (num != 0) {
            temp = num % 4;
            result.append(temp);
            num = num / 4;
        }
        for(String s:result.toString().split("")){
            if(s.equals("3")){
                result.replace(result.indexOf(s),result.indexOf(s)+1,"终极");
            }
        }
        return result.reverse().toString();
    }
    public static void getHtml(String id,String name)throws Exception{
        URL url =new URL("https://api.bilibili.com/x/relation/stat?vmid="+id+"&jsonp=jsonp");
        InputStream in = url.openStream();
        Scanner sc=new Scanner(in);
        String content = "";
        sc.useDelimiter("\n");
        while (sc.hasNext()) {
            content += sc.next();
        }
//        fastjson解析
        JSONObject jsonObject = JSON.parseObject(content);
        JSONObject data = jsonObject.getJSONObject("data");
        if (flag<2){
            switch (name){
                case "官方":
                    gf = data.getIntValue("follower");
                    break;
                case "大哥":
                    jl = data.getIntValue("follower");
                    break;
                case "乃琳":
                    nl = data.getIntValue("follower");
                    break;
                case "向晚":
                    xw = data.getIntValue("follower");
                    break;
                case "贝拉":
                    bl = data.getIntValue("follower");
                    break;
                case "然然":
                    jr = data.getIntValue("follower");
                    break;
            }
            flag++;
        }
        int temp = 0;
            switch (name){
                case "官方":
                    temp =gf-data.getIntValue("follower");
                    gf = data.getIntValue("follower");
                    break;
                case "大哥":
                    temp =jl-data.getIntValue("follower");
                    jl = data.getIntValue("follower");
                    break;
                case "乃琳":
                    temp =nl-data.getIntValue("follower");
                    nl = data.getIntValue("follower");
                    break;
                case "向晚":
                    temp =xw-data.getIntValue("follower");
                    xw = data.getIntValue("follower");
                    break;
                case "贝拉":
                    temp =bl-data.getIntValue("follower");
                    bl = data.getIntValue("follower");
                    break;
                case "然然":
                    temp =jr-data.getIntValue("follower");
                    jr = data.getIntValue("follower");
                    break;
            }
        System.out.println(name+"："+data.get("follower")+"下降人数："+temp);
            total(name,temp);
    }
    public static void total(String name,int temp){
        if (temp>0){
            switch (name){
                case "官方":
                    tgf += temp;
                    break;
                case "大哥":
                    tjl += temp;
                    break;
                case "乃琳":
                    tnl += temp;
                    break;
                case "向晚":
                    txw += temp;
                    break;
                case "贝拉":
                    tbl += temp;
                    break;
                case "然然":
                    tjr += temp;
                    break;
            }
        }
    }

}