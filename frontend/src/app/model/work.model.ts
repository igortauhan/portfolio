import { Skill } from './skill.model';

export class Work {
  public id: number;
  public companyName: string;
  public since: Date;
  public skills: Skill[];

  constructor(id: number, companyName: string, since: Date, skils: Skill[]) {
    this.id = id;
    this.companyName = companyName;
    this.since = since;
    this.skills = skils;
  }
}
