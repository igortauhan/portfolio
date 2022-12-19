require('dotenv').config();

export const environment = {
  production: true,
  backendUrl: process.env['BACKEND_URL_PROD'],
};
