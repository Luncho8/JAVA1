package sec04.exam05.package1;

public class HttpServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(new LoginServerlet());
		method(new FileDownloadServlet());
	}
	
	public static void method(HttpService servlet) {// 1.HttpService servlet = new LoginServerlet(); 2.HttpService servlet = new FileDownloadServlet();
		servlet.service();
	}

}
