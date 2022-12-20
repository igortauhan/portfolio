export class Article {
  public id: number;
  public title: string;
  public tags: string;
  public link: string;

  constructor(id: number, title: string, tags: string, link: string) {
    this.id = id;
    this.title = title;
    this.tags = tags;
    this.link = link;
  }
}
