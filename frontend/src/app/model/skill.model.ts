export class Skill {
  public id: number;
  public name: string;
  public since: Date;

  constructor(id: number, name: string, since: Date) {
    this.id = id;
    this.name = name;
    this.since = since;
  }
}
