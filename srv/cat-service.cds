using my.tasks as my from '../db/data-model';

service CatalogService {
    @readonly entity Tasks as projection on my.Tasks;
}