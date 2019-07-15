import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JhipsterMessageApplicationSharedModule } from 'app/shared';
import {
  MessageComponent,
  MessageDetailComponent,
  MessageUpdateComponent,
  MessageDeletePopupComponent,
  MessageDeleteDialogComponent,
  messageRoute,
  messagePopupRoute
} from './';

const ENTITY_STATES = [...messageRoute, ...messagePopupRoute];

@NgModule({
  imports: [JhipsterMessageApplicationSharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [
    MessageComponent,
    MessageDetailComponent,
    MessageUpdateComponent,
    MessageDeleteDialogComponent,
    MessageDeletePopupComponent
  ],
  entryComponents: [MessageComponent, MessageUpdateComponent, MessageDeleteDialogComponent, MessageDeletePopupComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhipsterMessageApplicationMessageModule {}
