import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { NgModule, OnInit } from '@angular/core';
import { Component } from '@angular/core';
import { Znamenitost } from './znamenitost';
import { ZnamenitostServis } from './znamenitost.servis';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
  
export class AppComponent implements OnInit {
  title(title: any) {
      throw new Error('Method not implemented.');
  }
  public znamenitosti: Znamenitost[] = [];
  constructor(private znamenitostServis: ZnamenitostServis) {}

  ngOnInit() {
    this.getZnamenitosti();
  }

  public getZnamenitosti(): void {
    this.znamenitostServis.getZnamenitosti().subscribe(
      (response: Znamenitost[]) =>{
        this.znamenitosti = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public pretragaZnamenitosti(key: string): void {
    console.log(key);
    const rezultat: Znamenitost[] = [];
    for (const znamenitost of this.znamenitosti) {
      if (znamenitost.naziv.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
        rezultat.push(znamenitost);
      }
    }
    this.znamenitosti = rezultat;
    if (rezultat.length === 0 || !key) {
      this.getZnamenitosti();
    }
  }








}
