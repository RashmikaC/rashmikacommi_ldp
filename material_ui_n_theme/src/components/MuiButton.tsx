import React , {useState}from "react";
import { Stack, Button, IconButton, ButtonGroup, ToggleButton, ToggleButtonGroup } from "@mui/material";
import SendIcon from "@mui/icons-material/Send";
import FormatBoldIcon from '@mui/icons-material/FormatBold';
import FormatItalicIcon from '@mui/icons-material/FormatItalic';
import FormatUnderlinedIcon from '@mui/icons-material/FormatUnderlined';

export const MuiButton = () => {
  const [formats, setFormats]=useState<string[]>([]);
 
  const handleFormatChange=(_event: React.MouseEvent<HTMLElement>,updatedFormats:string[])=>{
    setFormats(updatedFormats);
  }
  console.log({formats});
  return (
    <Stack spacing={2}>
      <Stack spacing={2} direction="row">
        {/* Less attention ex:confirmation popup */}
        <Button variant="text">Text</Button>
        {/* Used to grab users attention, primary actions ex:register,login button */}
        <Button variant="contained">Contained</Button>
        {/* used for secondary actions ex: cancel,go back button */}
        <Button variant="outlined">Outlined</Button>

        {/* We can use them as anchor tags */}
        <Button variant="text" href="https://google.com">
          Text
        </Button>
      </Stack>
      <br></br>
      <br></br>
      <Stack spacing={2} direction="row">
        <Button variant="text" color="primary">
          Primary
        </Button>
        <Button variant="text" color="secondary">
          Secondary
        </Button>
        <Button variant="text" color="success">
          Success
        </Button>
        <Button variant="text" color="warning">
          Warning
        </Button>
        <Button variant="text" color="info">
          Info
        </Button>
        <Button variant="text" color="error">
          Error
        </Button>
        <Button variant="text" color="inherit">
          Inherit
        </Button>
      </Stack>
      <br></br>
      <br></br>
      <Stack spacing={2} direction="row">
        <Button variant="contained" color="primary">
          Primary
        </Button>
        <Button variant="contained" color="secondary">
          Secondary
        </Button>
        <Button variant="contained" color="success">
          Success
        </Button>
        <Button variant="contained" color="warning">
          Warning
        </Button>
        <Button variant="contained" color="info">
          Info
        </Button>
        <Button variant="contained" color="error">
          Error
        </Button>
        <Button variant="contained" color="inherit">
          Inherit
        </Button>
      </Stack>
      <br></br>
      <br></br>
      <Stack spacing={2} direction="row">
        <Button variant="outlined" color="primary">
          Primary
        </Button>
        <Button variant="outlined" color="secondary">
          Secondary
        </Button>
        <Button variant="outlined" color="success">
          Success
        </Button>
        <Button variant="outlined" color="warning">
          Warning
        </Button>
        <Button variant="outlined" color="info">
          Info
        </Button>
        <Button variant="outlined" color="error">
          Error
        </Button>
        <Button variant="outlined" color="inherit">
          Inherit
        </Button>
      </Stack>
      <br></br>
      <br></br>
      <Stack spacing={2} direction="row">
        <Button variant="contained" size="small">
          Small
        </Button>
        <Button variant="contained" size="medium">
          Medium
        </Button>
        <Button variant="contained" size="large">
          Large
        </Button>
      </Stack>
      <br></br>
      <br></br>
      <Stack spacing={2} direction="row">
        <Button
          variant="contained"
          startIcon={<SendIcon />}
          disableRipple
          onClick={() => alert("Clicked")}
        >
          Send
        </Button>
        <Button variant="contained" endIcon={<SendIcon />} disableElevation>
          Send
        </Button>
        <IconButton aria-label="send">
          <SendIcon />
        </IconButton>
        <IconButton aria-label="send" color="success">
          <SendIcon />
        </IconButton>
        <IconButton aria-label="send" color="warning" size="small">
          <SendIcon />
        </IconButton>
      </Stack>
      <br></br>
      <br></br>
      <Stack direction="row">
        <ButtonGroup
          variant="contained"
          color="secondary"
          orientation="vertical"
          size="small"
          aria-label="alignment button group"
        >
          <Button onClick={() => alert("Left clicked!")}>Left</Button>
          <Button>Center</Button>
          <Button>Right</Button>
        </ButtonGroup>
      </Stack>
      <br></br>
      <br></br>
      <Stack direction='row'>
        <ToggleButtonGroup aria-label='text formatting' value={formats} onChange={handleFormatChange} orientation='vertical' exclusive>
          <ToggleButton value='bold' aria-label="bold"><FormatBoldIcon /></ToggleButton>
          <ToggleButton value='italic' aria-label="italic"><FormatItalicIcon /></ToggleButton>
          <ToggleButton value='underlined' aria-label="underlined"><FormatUnderlinedIcon /></ToggleButton>
        </ToggleButtonGroup>
        <Button variant="contained" component="label">
              Upload
            <input hidden accept="image/*" multiple type="file" />
        </Button>
      </Stack>
    </Stack>
  );
};
