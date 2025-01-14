import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { APP_BASE_HREF } from '@angular/common';
import { NgbPaginationModule, NgbModalModule, NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule, routingComponents } from './app-routing.module';
import { NotifierModule } from 'angular-notifier';

import { AppComponent } from './app.component';
import { SignerEditorComponent } from './signer-editor/signer-editor.component';
import { SignerListComponent } from './signer-list/signer-list.component';
import { EmptyStringValidator } from './validation/required.validation';

@NgModule({
	imports: [BrowserModule, HttpClientModule, FormsModule, ReactiveFormsModule, NgbPaginationModule, AppRoutingModule, NgbModalModule, NotifierModule, NgbDropdownModule],
	declarations: [AppComponent, SignerEditorComponent, SignerListComponent, routingComponents, EmptyStringValidator],
	entryComponents: [AppComponent],
	bootstrap: [], // Don't bootstrap any component statically (see ngDoBootstrap() below)
	providers: [{provide: APP_BASE_HREF, useValue: '/'}],
})
export class AppModule {
	// Avoid bootstraping any component statically because we need to attach to
	// the portlet's DOM, which is different for each portlet instance and,
	// thus, cannot be determined until the page is rendered (during runtime).
	ngDoBootstrap() {}
}
