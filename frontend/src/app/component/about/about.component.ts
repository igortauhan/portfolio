import { Component, Input } from '@angular/core';
import { About } from 'src/app/model/about.model';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.scss'],
})
export class AboutComponent {
  @Input() public about?: About;

  constructor() {}

  ngOnInit(): void {}
}
