package springfive.cms.domain.resources;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import springfive.cms.domain.models.News;
import springfive.cms.domain.models.Review;
import springfive.cms.domain.vo.NewsRequest;

/**
 * @author claudioed on 29/10/17. Project cms
 */


public class NewsResource {


  public ResponseEntity<News> findOne( String id){
    return ResponseEntity.ok(new News());
  }


  public ResponseEntity<List<News>> findAll(){
    return ResponseEntity.ok(Arrays.asList(new News(),new News()));
  }


  public ResponseEntity<News> newNews(NewsRequest news){
    return new ResponseEntity<>(new News(), HttpStatus.CREATED);
  }



  public void removeNews( String id){
  }


  public ResponseEntity<News> updateNews(String id,NewsRequest news){
    return new ResponseEntity<>(new News(), HttpStatus.OK);
  }


  public ResponseEntity<Review> review(String id,String userId){
    return ResponseEntity.ok(new Review());
  }


  public ResponseEntity<List<News>> revisedNews(){
    return ResponseEntity.ok(Arrays.asList(new News(),new News()));
  }

}
