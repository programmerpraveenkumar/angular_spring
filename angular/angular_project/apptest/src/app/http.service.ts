import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {APP_CONSTANTS} from '../app/APP_CONSTANTS';
@Injectable({
  providedIn: 'root'
})
export class HttpService {
 
  constructor(private http: HttpClient,private appConstant:APP_CONSTANTS) { }
  postHttp(endpoint,params){
   // console.log(this.appConstant.URL);
    return this.http.post("http://localhost:8080/"+endpoint ,params);
  }
}
