package bleier.dictionary;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.google.gson.Gson;

import java.io.IOException;

public class DictionaryRequestHandler implements RequestHandler<APIGatewayProxyRequestEvent, DictionaryResponse> {

    @Override
    public DictionaryResponse handleRequest(APIGatewayProxyRequestEvent event, Context context) {
        String body = event.getBody();
        Gson gson = new Gson();
        DictionaryRequest request = gson.fromJson(body, DictionaryRequest.class);
        TouroDictionary dictionary = null;
        try {
            dictionary = new TouroDictionary();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new DictionaryResponse(request.getWord(), dictionary.lookup(request.getWord()));
    }

}
