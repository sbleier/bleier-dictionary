package bleier.dictionary;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface TouroDictionaryService {

    //code format taken from products project but with POST bc that was curl request in github instructions
    @Headers("Content-Type: application/json")
    @POST("/")
    Call<DictionaryResponse> lookup(@Body DictionaryRequest request);

}

