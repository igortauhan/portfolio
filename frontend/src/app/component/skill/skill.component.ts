import { Component, Input } from '@angular/core';
import { Skill } from 'src/app/model/skill.model';

@Component({
  selector: 'app-skill',
  templateUrl: './skill.component.html',
  styleUrls: ['./skill.component.scss'],
})
export class SkillComponent {
  @Input() public skills?: Skill[];

  constructor() {}

  ngOnInit(): void {}
}
