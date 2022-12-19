import { About } from './about.model';
import { Article } from './article.model';
import { Skill } from './skill.model';
import { Social } from './social.model';
import { Work } from './work.model';

export class Portfolio {
  public about: About;
  public articles: Article[];
  public skills: Skill[];
  public socials: Social[];
  public works: Work[];

  constructor(
    about: About,
    articles: Article[],
    skills: Skill[],
    socials: Social[],
    works: Work[]
  ) {
    this.about = about;
    this.articles = articles;
    this.skills = skills;
    this.socials = socials;
    this.works = works;
  }
}
