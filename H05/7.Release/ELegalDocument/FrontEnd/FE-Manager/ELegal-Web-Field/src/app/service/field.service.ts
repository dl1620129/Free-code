import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import{ Constants } from '../common/constants';

@Injectable({
    providedIn: 'root'
})export class FieldService {

    constructor(private http: HttpClient) { };
    private handleError(error : HttpErrorResponse) {
        if (error.error instanceof ErrorEvent) {
            // A client-side or network error occurred. Handle it accordingly.
            console.error('An error occurred:', error.error.message);
          } else {
            // The backend returned an unsuccessful response code.
            // The response body may contain clues as to what went wrong,
            console.error(
              `Backend returned code ${error.status}, ` +
              `body was: ${error.error}`);
          }
          // return an observable with a user-facing error message
          return throwError(
            'Something bad happened; please try again later.');
    };
    
    public getAllFields(start: number, pageSize: number, searchKey: string) {
        let url = Constants.baseUrl + '/o/legalfield/app/getall/' + Constants.scopeGroupId + '/' + Constants.languageId + '/' + Constants.companyId + '?start=' + start + '&limit=' + pageSize + '&q=' + searchKey;
        return this.http.get(url).pipe(catchError(this.handleError));
    }

    public getField(id: number) {
        let url = Constants.baseUrl + '/o/legalfield/app/get/item/' + id;
        return this.http.get(url).pipe(catchError(this.handleError));
    }

    public deleteField(fieldIdList: number[]) {
        let body = new FormData();
        fieldIdList.forEach((element: number) => {
            body.append('legalFieldId', element.toString());
        });
        let url = Constants.baseUrl + '/o/legalfield/app/delete/'+  Constants.userId + '/' + Constants.scopeGroupId;
        return this.http.post(url, body).pipe(catchError(this.handleError));
    }

    public submitField(form: any, id: any) {
        let headers = new HttpHeaders({
            'Content-Type': 'application/json'
        });

        let body = {
            'name': form.get('name').value,
            'description': form.get('description').value,
            'statusField': form.get('statusField').value,
            'position': form.get('position').value
        };

        console.log(body);
        if (id) {  
            let updateUrl = Constants.baseUrl + '/o/legalfield/app/update/' + Constants.userId + '/' + Constants.scopeGroupId + '/' + Constants.languageId + '/' + Constants.companyId + '/' + id;
            console.log(updateUrl);
            return this.http.put(updateUrl, body, {headers: headers}).pipe(catchError(this.handleError));
        }

        let createUrl = Constants.baseUrl + '/o/legalfield/app/create/' +  Constants.userId + '/' + Constants.scopeGroupId + '/' + Constants.languageId + '/' + Constants.companyId;
        return this.http.post(createUrl, body, {headers: headers}).pipe(catchError(this.handleError));
    }

    public getMaxNumber() {
        let url = Constants.baseUrl + '/o/legalfield/app/get/max-order-number/' +  Constants.scopeGroupId + '/' + Constants.languageId + '/' + Constants.companyId;
        return this.http.get(url).pipe(catchError(this.handleError));
    }
}