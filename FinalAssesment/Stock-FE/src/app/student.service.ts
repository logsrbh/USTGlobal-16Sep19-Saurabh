import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class StudentService {

    name = 'qwerty';

    printData() {
        console.log('This is a function from StudentService');
    }
}
