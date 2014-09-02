package encoder;
import java.io.UnsupportedEncodingException;
import java.net.*;

public class URLEncodeStringMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String target  = "https://www.google.co.jp/";//エンコードしたい文字列
		String encode = "EUC-JP";//フォーマット(UTF-8,EUC-JP etc)
		
		if(args != null && args.length >= 2){
			//target = args[0];
			encode = args[1];
		}
		System.out.println("target::" + target + " encode::" + encode);
		String encodeString = "";
		try {
			encodeString = URLEncoder.encode(target,encode);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//percent encodin
		//encodeString = encodeString.replace("*", "%2A").replace("-", "%2D").replace(".", "%2E");

		//コメント追加
		System.out.println("encoded::" + encodeString);
	}
}
