package Proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwitterService service=(TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());
		
		System.out.println(service.getTimeline("bhj"));

	}

}
