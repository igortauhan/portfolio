import { Component, Input } from '@angular/core';
import { Social } from 'src/app/model/social.model';

@Component({
  selector: 'app-social',
  templateUrl: './social.component.html',
  styleUrls: ['./social.component.scss'],
})
export class SocialComponent {
  @Input() public socials?: Social[];

  constructor() {}

  ngOnInit(): void {}
}
