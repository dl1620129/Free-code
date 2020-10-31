import { Component } from '@angular/core';

import LiferayParams from '../types/LiferayParams'
import { Constants } from './common/constants';

declare const Liferay: any;

@Component({
	templateUrl: 
		Liferay.ThemeDisplay.getPathContext() + 
		'/o/ELegal-Web-View-SearchDocument/app/app.component.html'
})
export class AppComponent {
	params: LiferayParams;
	labels: any;

	constructor() {
		this.labels = {        
			
			configuration: Liferay.Language.get('configuration'),
			
			portletNamespace: Liferay.Language.get('portlet-namespace'),
        	contextPath: Liferay.Language.get('context-path'),
			portletElementId: Liferay.Language.get('portlet-element-id'),
		}
	}

	
    ngOnInit() {
		if (this.params.configuration.portletInstance.display) {
			Constants.CONFIGURATION = this.params.configuration.portletInstance.display;
		};
    }

	get configurationJSON() {
		return JSON.stringify(this.params.configuration, null, 2);
	}
}
