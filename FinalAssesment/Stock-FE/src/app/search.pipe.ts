import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(products: any[],  searchValue:string): any {
    if (searchValue === undefined) {
      return products;
    } else {
      return products.filter(data => { 
        return data.name.toLowerCase().includes(searchValue.toLowerCase())
      });
  }
  }

}
