import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import{ Constants } from '../common/constants';
import { Category } from '../model/Category';

@Injectable({
    providedIn: 'root'
})export class CategoryService {

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

    public getAllCategories(parentId: number) {
        let url = Constants.baseUrl + '/o/news/app/detail/getall/category' + '?parentId=' + parentId;
        return this.http.get(url).pipe(catchError(this.handleError));
    }
    public getcategorylayout() {
        let url = Constants.baseUrl + '/o/categorylayout/app/update/view/' + Constants.scopeGroupId + '/' + Constants.languageId;   
        return this.http.get(url).pipe(catchError(this.handleError));
    }
    public checkAdmin() {
        let url = Constants.baseUrl + '/o/news/app/featured-new/check/admin/' + Constants.companyId + '/' + Constants.userId;
        return this.http.get(url).pipe(catchError(this.handleError));
    }

    public convertTreeList(treeList: Category[], level: number) {
        let newCategoryList = new Array();
        treeList.forEach((element: Category) => {
            let newTitle = '';
            for(let i = 0; i < level; i++) {
                newTitle += '\u00A0\u00A0\u00A0';
            }
            newTitle += element.title;
            let newElement = element;
            newElement.title = newTitle;
            newCategoryList.push(newElement);

            let childList = this.convertTreeList(element.child, level+1);
            childList.forEach((childElement: Category) => {
                newCategoryList.push(childElement);
            });
        });
        return newCategoryList;
    }
}
