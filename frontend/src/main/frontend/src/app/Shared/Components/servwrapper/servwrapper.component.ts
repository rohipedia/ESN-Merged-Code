import { Component, OnInit } from '@angular/core';
import {URLSearchParams} from '@angular/http';
import { Http, Response, RequestOptions, Headers } from '@angular/http';
@Component({
  selector: 'app-servwrapper',
  templateUrl: './servwrapper.component.html',
  styleUrls: ['./servwrapper.component.css']
})
export class ServwrapperComponent implements OnInit {

  constructor(private http: Http) {}

  apiRoot: string = "http://localhost:8080/api"; 
  ngOnInit() {
    
  }

  doGET() {
    let url = `${this.apiRoot}/get`;
    this.http.get(url).subscribe(res => console.log(res.json())); 
  }

  doPOST() {
    let url = `${this.apiRoot}/post`;
    this.http.post(url, {a:"esn",c:"devicename"}).subscribe(res => console.log(res.json()));
  }

  doPUT() {
    let url = `${this.apiRoot}/put`;
  let search = new URLSearchParams();
  search.set('a', 'esn');
  search.set('c', 'deviceprop');
  this.http.put(url, {a:"esn",c:"deviceprop"}, {search}).subscribe(res => console.log(res.json()));
  }

  doDELETE() {
  let url = `${this.apiRoot}/delete`;
  let search = new URLSearchParams();
  search.set('a', 'esn');
  search.set('c', 'devicename');
  this.http.delete(url, {search}).subscribe(res => console.log(res.json()));
  }
/*createArticle(article: Article):Observable<number> {
  let cpHeaders = new Headers({ 'Content-Type': 'application/json' });
  let options = new RequestOptions({ headers: cpHeaders });
  return this.http.post(this.articleUrl, article, options)
      .map(success => success.status)
      .catch(this.handleError);
} 
getArticleById(articleId: string): Observable<Article> {
  let cpHeaders = new Headers({ 'Content-Type': 'application/json' });
  let cpParams = new URLSearchParams();
  cpParams.set('id', articleId);			
  let options = new RequestOptions({ headers: cpHeaders, params: cpParams });
  return this.http.get(this.articleUrl, options)
    .map(this.extractData)
    .catch(this.handleError);
} 
updateArticle(article: Article):Observable<number> {
  let cpHeaders = new Headers({ 'Content-Type': 'application/json' });
  let options = new RequestOptions({ headers: cpHeaders });
  return this.http.put(this.articleUrl +"/"+ article.id, article, options)
         .map(success => success.status)
         .catch(this.handleError);
} 

deleteArticleById(articleId: string): Observable<number> {
  let cpHeaders = new Headers({ 'Content-Type': 'application/json' });
  let options = new RequestOptions({ headers: cpHeaders });
  return this.http.delete(this.articleUrl +"/"+ articleId)
   .map(success => success.status)
   .catch(this.handleError);
} 

this.articleService.getAllArticles()
     .subscribe(articles => {
           //Data from server has been received.
           //perform operation on articles
         }
     ); 
 
   */
  
 }