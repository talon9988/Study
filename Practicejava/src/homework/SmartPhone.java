package homework;

public class SmartPhone extends MusicPhone {

    public void execute(String str){ //오버라이드

    	        if("앱".equals(str)){
    	            start();
    	        }
    	        else if("음악".equals(str)){ 
    	        	//둘중하나 좋아하는거 고르세요
    	        	//super.execute(str); 
    	        	play();
    	        }
    	        else {
    	        	super.execute(str);
    	        }
    	        
    	    }
        
    
 
    //메소드작성
    	private void start(){
    		System.out.println("앱실행");
    	}
    
    //잉여 메소드작성
    	private void play() {
    		System.out.println("다운로드해서 음악재생");
    	}
    	
}

