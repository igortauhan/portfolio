import { Component } from '@angular/core';
import { Portfolio } from 'src/app/model/portfolio.model';
import { PortfolioService } from 'src/app/service/portfolio.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent {
  public portfolio?: Portfolio;

  constructor(private portfolioService: PortfolioService) {}

  ngOnInit(): void {
    this.portfolioService.getPortfolio().subscribe((response: Portfolio) => {
      this.portfolio = response;
    });
  }
}
