import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { environment } from 'src/environment/environment.prod';
import { Portfolio } from '../model/portfolio.model';

@Injectable({
  providedIn: 'root',
})
export class PortfolioService {
  private backendUrl = environment.backendUrl;

  constructor(private httpClient: HttpClient) {}

  public getPortfolio(): Observable<Portfolio> {
    return this.httpClient.get<Portfolio>(this.backendUrl + '/portfolios');
  }
}
