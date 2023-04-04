import React from 'react'
import {Stack, Link, Typography} from '@mui/material'

export const MuiLink = () => {
  return (
    <Stack spacing={2} direction='row' m={4}>
        <Link href='#'>Link</Link>
        <Link href='#' color='secondary' underline='hover'>Secondary</Link>
        <Link href='#' underline='none' variant='h5'>Link</Link>
        <Typography variant='h6'>
        <Link href='#'>Link</Link>
        </Typography>
    </Stack>
  )
}
