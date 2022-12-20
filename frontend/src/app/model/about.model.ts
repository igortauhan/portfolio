export class About {
  public id: number;
  public name: string;
  public role: string;
  public description: string;

  constructor(id: number, name: string, role: string, description: string) {
    this.id = id;
    this.name = name;
    this.role = role;
    this.description = description;
  }
}
