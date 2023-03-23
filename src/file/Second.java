package file;


public class Second {

	public static void main(String[] args) {
		//100000초를 일 시간 분 초로 변환하고 1년이상인지 확인하는 프로그램
		
		int day,hour,minute,seconds;

		day=100000/86400;
		hour=(100000%86400)/3600;
		minute=((100000%86400)%3600)/60;
		seconds=((100000%86400)%3600)%60;
			
		System.out.print(day+"일"+"\t");
		System.out.print(hour+"시간"+"\t");	
		System.out.print(minute+"분"+"\t");	
		System.out.print(seconds+"초"+"\t");
		

	}

}
