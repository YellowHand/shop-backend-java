-- liquibase formatted sql
-- changeset pborkowski:4
alter table product
    add slug varchar(255) after image;