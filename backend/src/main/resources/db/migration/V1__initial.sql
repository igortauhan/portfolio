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
