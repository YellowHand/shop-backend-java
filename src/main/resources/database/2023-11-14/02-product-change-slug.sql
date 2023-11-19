-- liquibase formatted sql
-- changeset pborkowski:5
alter table product
    add constraint ui_product_slug unique key (slug);