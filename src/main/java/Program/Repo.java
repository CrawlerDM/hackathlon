package Program;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.codec.BodyCodec;


public class Repo {
    private final Vertx vertex = Vertx.vertx();

    private final WebClient webClient = WebClient.create(vertex);



    public void getGroups(){

        System.out.println(webClient.post(443,"https://htf.bewire.org/","6a2a6ada-303c-40c7-a87a-9b9370030e8f").ssl(true)
                .as(BodyCodec.jsonObject()).send().onComplete(res-> System.out.println(res.result().bodyAsString())));
    }

    public Future<HttpResponse<Buffer>> getCeases() {
        //return "https://randomuser.me/api/portraits/med/men/96.jpg";

        System.out.println("test");

        return webClient.post(443,"https://htf.bewire.org","/case/")
                .ssl(true).sendJsonObject(new JsonObject().put("teamId","6a2a6ada-303c-40c7-a87a-9b9370030e8f")).onSuccess(HttpResponse::bodyAsJsonObject);

    }


    public Future<String> getPictureUrl() {
        //return "https://randomuser.me/api/portraits/med/men/96.jpg";



        return webClient.get(443,"randomuser.me","/api/")
                .ssl(true)
                .as(BodyCodec.jsonObject())
                .send()
                .map(res->res.body())
                .map(json->json.getJsonArray("results"))
                .map(json->json.getJsonObject(0))
                .map(json->json.getJsonObject("picture"))
                .map(json->json.getString("medium"));



    }
}
