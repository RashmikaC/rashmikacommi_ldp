import React from 'react'
import './index.css';
import {CompanyIcon} from '../../Atoms/CompanyIcon/index'
import {Typography} from '../../Atoms/Typography/index'
import {RouteIcons} from '../../Atoms/RouteIcons/index'
import { Paper} from '@mui/material';

export const Card = () => {
  return (
    <Paper sx={{padding:'10px',width:'270px',height:'200px'}} elevation={2}>
        <CompanyIcon />
        <span id='options'>...</span>
        <br />
        <Typography header='User Experience Designer' company='HP' location='Hyderabad, Telangana, India'/>
        <br />
        <RouteIcons />
    </Paper>
  )
}
