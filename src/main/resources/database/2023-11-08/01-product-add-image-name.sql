-- liquibase formatted sql
-- changeset pborkowski:2
alter table product add image varchar(128) after currency;