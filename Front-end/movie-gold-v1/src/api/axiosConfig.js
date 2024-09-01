import { create } from '@mui/material/styles/createTransitions';
import axios from 'axios';

export default axios.create({
    baseURL: 'https://84bc-116-74-220-95.ngrok-free.app',
    headers: { "ngrok-skip-browser-warning": "true" }
});