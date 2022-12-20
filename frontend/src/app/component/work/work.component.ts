import { Component, Input } from '@angular/core';
import { Work } from 'src/app/model/work.model';

@Component({
  selector: 'app-work',
  templateUrl: './work.component.html',
  styleUrls: ['./work.component.scss'],
})
export class WorkComponent {
  @Input() public works?: Work[];

  constructor() {}

  ngOnInit(): void {}
}
