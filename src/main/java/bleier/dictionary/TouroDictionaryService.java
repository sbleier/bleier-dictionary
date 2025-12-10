package bleier.dictionary;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TouroDictionaryService {

    //code format taken from products project but with POST bc that was curl request in github instructions
    @POST("/")
    Single<DictionaryResponse> lookup(@Body DictionaryRequest request);

}

