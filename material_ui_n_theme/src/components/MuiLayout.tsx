import React from "react";
import { Box, Stack, Divider, Grid } from "@mui/material";

export const MuiLayout = () => {
  return (
    <>
      <Stack
        sx={{ border: "1px solid" }}
        direction="row"
        spacing={2}
        divider={<Divider orientation="vertical" flexItem />}
      >
        <Box
          sx={{
            backgroundColor: "primary.main",
            color: "white",
            height: "100px",
            width: "100px",
            padding: "16px",
            "&:hover": {
              backgroundColor: "primary.light",
            },
          }}
        >
          Hello
        </Box>
        <Box
          display="flex"
          height="100px"
          width="100px"
          bgcolor="success.light"
          p={2}
        ></Box>
      </Stack>
      <Grid container m={4} rowSpacing={2} columnSpacing={1}>
        <Grid item xs={12} sm={6}>
          <Box bgcolor='primary.light' p={2}>Item1</Box>
        </Grid>
        <Grid item xs={12} sm={6}>
          <Box bgcolor='primary.light' p={2}>Item2</Box>
        </Grid>
        <Grid item xs={12} sm={6}>
          <Box bgcolor='primary.light' p={2}>Item3</Box>
        </Grid>
        <Grid item xs={12} sm={6}>
          <Box bgcolor='primary.light' p={2}>Item4</Box>
        </Grid>
      </Grid>
    </>
  );
};

// <Box component='span'
//Grid has 12 columns, it uses flexbox module
// if you need all equal width add xs to all items without any val
// xs='auto' in this case the size of item depends on natural width of its content
