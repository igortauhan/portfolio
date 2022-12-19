require('dotenv').config();

export const environment = {
  production: true,
  backend_url: process.env['BACKEND_URL_PROD'],
};
