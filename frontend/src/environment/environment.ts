require('dotenv').config();

export const environment = {
  production: false,
  backendUrl: process.env['BACKEND_URL_LOCALHOST'],
};
