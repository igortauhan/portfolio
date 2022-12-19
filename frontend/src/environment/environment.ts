require('dotenv').config();

export const environment = {
  production: false,
  backend_url: process.env['BACKEND_URL_LOCALHOST'],
};
