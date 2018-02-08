//package ExampleWebServer;
//
//import java.util.logging.Logger;
//
//import io.vertx.core.http.HttpServer;
//
//public class ExampleWebServer {
//
//
//	public void start() {
//		   final Logger logger = container.logger();
//		   
//		   HttpServer server = vertx.createHttpServer();
//		   
//		   server.requestHandler();
//		   
//		   vertx.eventBus().registerHandler(ADDRESS, new Handler<Message<?>>()
//		    {
//		         public void handle(Message<?> msg) {
//		            String body = msg.body().toString();
//		            logger.info("Got message: " + body + "\tReply it now.");
//		            msg.reply("Got your message: " + body); // just return back what it received.
//		         };
//		    });
//		   
//		   logger.info("Register handler on address: " + ADDRESS);
//		   
//		   JsonObject config = new JsonObject().putString("prefix", "/eventbus");
//		   
//		   // currently permit all messages passed in/out, just do this for example.
//		   vertx.createSockJSServer(server).bridge(config, new JsonArray().add(new JsonObject()),
//		         new JsonArray().add(new JsonObject()));
//		   int port = Integer.getInteger("vertx.http.port", 8090);
//		   server.listen(port);
//		   logger.info("Server Started at port: " + port);
//		}
//}
