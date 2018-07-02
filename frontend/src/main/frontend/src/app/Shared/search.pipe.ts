import { Pipe, PipeTransform } from "@angular/core";

@Pipe({ name: 'searchData' })
export class SearchDataPipe implements PipeTransform {
    filteredItems = [];
    transform(items: any, term: string) {
        if(term === undefined) return items;
        this.filteredItems = items.filter( function(item){
            return  Object.keys(item).some(function(key) {
                if (key === "userName" || key === "email") {
                    return item[key].toLowerCase().includes(term.toLowerCase());
                }
                if (key === "userId") {
                    return item[key].toString().includes(term.toString());
                }
            });
        });
        return this.filteredItems;
    }
    
}