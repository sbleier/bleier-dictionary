package bleier.dictionary;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TouroDictionaryServiceFactory {

    //this code was taken from our earlier project products but without the adapter
    public TouroDictionaryService create() {

        Retrofit retrofit = new Retrofit.Builder()
                //method calls
                //server that we can connect to
                .baseUrl("https://6nfmijq3ax2lzs2semhxdgaxwa0zukew.lambda-url.us-east-2.on.aws/")
                // Configure Retrofit to use Gson to turn the Json into Objects
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(TouroDictionaryService.class);

    }
}
