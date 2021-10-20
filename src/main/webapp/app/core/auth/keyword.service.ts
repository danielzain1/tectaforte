import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable, Subject } from 'rxjs';

import { SERVER_API_URL } from 'app/app.constants';
import { Account } from 'app/core/user/account.model';
import { Keyword } from 'app/core/user/keyword.model';

@Injectable({ providedIn: 'root' })
export class keywordService {


  constructor(private http: HttpClient) {}

  fetch(): Observable<HttpResponse<Keyword>> {
    return this.http.get<Keyword>(SERVER_API_URL + 'api/keyword/testing', { observe: 'response' });
  }


  save(keyword: any): Observable<HttpResponse<any>> {
    return this.http.post(SERVER_API_URL + 'api/keyword/testing', keyword, { observe: 'response' });
  }


}
