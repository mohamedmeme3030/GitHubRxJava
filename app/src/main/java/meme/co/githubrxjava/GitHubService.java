package meme.co.githubrxjava;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GitHubService {
    @GET("users/{user}/starred")
    Observable<List<GitHubModel>> getStarredRepositories(@Path("user") String userName);
}
