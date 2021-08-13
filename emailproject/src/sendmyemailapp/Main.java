package sendmyemailapp;

public class Main {
    public static void main(String[] args) {
//		JavaSendEmail.sendMail("yasmeen.a243@gmail.com");
//		JavaSendEmail.sendMail("azeezbasha1023@gmail.com");
//		JavaSendEmail.sendMail("ssivakumar.ms@gmail.com");
//		JavaSendEmail.sendMail("shamirahmed1@gmail.com");
//		JavaSendEmail.sendMail("farsheq@gmail.com");
//		JavaSendEmail.sendMail("shamir7560@gmail.com");
   
//    	String mail[]=new String[6];
//    	mail[0]="yasmeen.a243@gail.com";
//    	mail[1]="azeezbasha1023@gmail.com";
//    	mail[2]="ssivakumar.ms@gmail.com";
//    	mail[3]="shamirahmed1@gmail.com";
//    	mail[4]="farsheq@gmail.com";
//    	
//    	for(String s:mail) {
//    		JavaSendEmail.sendMail(s);
//    	}
    	
    	new Thread(()->{JavaSendEmail.sendMail("yasmeen.a243@gmail.com");
    	JavaSendEmail.sendMail("shamir7560@gmail.com");
    	JavaSendEmail.sendMail("ssivakumar.ms@gmail.com");
    	}).start();
	}
}
