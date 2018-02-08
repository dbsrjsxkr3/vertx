package fileserver;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.streams.Pump;
import io.vertx.core.http.HttpServer;


public class fileserver{

	public static void main(String[] args) {
	    Vertx vertx = Vertx.vertx(); 
	    vertx.createHttpServer().requestHandler(req -> {
	        String filename = null;
	        
	        System.out.println(req.path()+"");
	        
//	        if (req.path().equals("/")) {
//	            filename = "index.html";
//	        } else if (req.path().equals("/page1.html")) {
//	            filename = "page1.html";
//	        } else if (req.path().equals("/page2.html")) {
//	            filename = "page2.html";
//	        } else {
//	            req.response().setStatusCode(404).end();
//	        }
	        
	        
	        
	       // if (filename != null) {
	            req.response().sendFile("draw/a.png");
	      //  }
	    }).listen(8086);

	}

	
}


