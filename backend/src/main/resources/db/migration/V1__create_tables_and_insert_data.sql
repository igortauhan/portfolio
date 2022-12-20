create table tb_about
(
    id          bigserial not null,
    description varchar(255),
    name        varchar(255),
    role        varchar(255),
    primary key (id)
);
create table tb_article
(
    id    bigserial not null,
    link  varchar(255),
    tags  varchar(255),
    title varchar(255),
    primary key (id)
);
create table tb_skill
(
    id    bigserial not null,
    name  varchar(255),
    since timestamp(6),
    primary key (id)
);
create table tb_social
(
    id   bigserial not null,
    link varchar(255),
    name varchar(255),
    primary key (id)
);
create table tb_work
(
    id           bigserial not null,
    since        timestamp(6),
    company_name varchar(255),
    description varchar(255),
    primary key (id)
);
create table tb_work_skill
(
    work_id  bigint not null,
    skill_id bigint not null,
    primary key (work_id, skill_id)
);
alter table if exists tb_work_skill add constraint FKdpayimssas117rv6dnr1iouyn foreign key (skill_id) references tb_skill;
alter table if exists tb_work_skill add constraint FKibx2ypfikky99ch208raom9mg foreign key (work_id) references tb_work;

-- !!! Insert Data into the tables !!! --
-- !!! Adjust before host project !!! --

-- About
insert into tb_about(id, description, name, role) VALUES (1,
                                                          'Desenvolvedor Fullstack que estuda programação a 3 anos. Dediquei os últimos dois anos para o desenvolvimento web com foco em Backend com Java e Spring Boot.',
                                                          'Igor Tauhan',
                                                          'Desenvlvedor Fullstack');

-- Articles
insert into tb_article(id, link, tags, title) VALUES (1,
                                                      'https://dev.to/igortauhan/melhorando-a-sua-produtividade-no-terminal-linux-1gi6',
                                                      'Programação, Linux, desenvolvimento',
                                                      'Melhorando sua produtividade no terminal Linux.');

-- Skills
insert into tb_skill(id, name, since) VALUES (1,
                                              'Java',
                                              '2020-01-01');

insert into tb_skill(id, name, since) VALUES (2,
                                              'Spring Boot',
                                              '2021-01-01');

insert into tb_skill(id, name, since) VALUES (3,
                                              'Javascript',
                                              '2021-01-01');

insert into tb_skill(id, name, since) VALUES (4,
                                              'Typescript',
                                              '2021-01-01');

insert into tb_skill(id, name, since) VALUES (5,
                                              'Angular',
                                              '2022-01-01');

insert into tb_skill(id, name, since) VALUES (6,
                                              'C#',
                                              '2020-01-01');

insert into tb_skill(id, name, since) VALUES (7,
                                              'MongoDB',
                                              '2021-01-01');

insert into tb_skill(id, name, since) VALUES (8,
                                              'Postgres',
                                              '2021-01-01');

insert into tb_skill(id, name, since) VALUES (9,
                                              'MySQL',
                                              '2021-01-01');

insert into tb_skill(id, name, since) VALUES (10,
                                              'Bootstrap',
                                              '2021-01-01');

-- Socials
insert into tb_social(id, link, name) VALUES (1,
                                              'https://github.com/igortauhan',
                                              'Github');

insert into tb_social(id, link, name) VALUES (2,
                                              'https://linkedin.com/in/igortauhan',
                                              'Linkedin');

-- Works
insert into tb_work(id, since, company_name, description) VALUES (1,
                                                     '2022-05-02',
                                                     'GAT InfoSec',
                                                     'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry. Lorem Ipsum has been the industry. Lorem Ipsum has been the industry.');

-- Relations
insert into tb_work_skill(work_id, skill_id) VALUES (1, 2);
insert into tb_work_skill(work_id, skill_id) VALUES (1, 5);
insert into tb_work_skill(work_id, skill_id) VALUES (1, 7);
